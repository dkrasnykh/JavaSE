package com.mera.training.advanced.practice9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class XmlSerializer {
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE})
    public @interface XmlTypeName {
        String value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface XmlName {
        String value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface XmlIgnore {
    }

    @XmlTypeName("Человек")
    static class Person {
        @XmlName("Имя")
        String firstName;
        @XmlName("Возраст")
        double age;
        @XmlIgnore
        String password;

        public Person(){}

        public Person(String firstName, double age) {
            this.firstName = firstName;
            this.age = age;
            password = "123";
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Person person1 = new Person("Ivan", 18);
        Person person2 = new Person("Petr", 19);

        System.out.println(serialize(person1));
        System.out.println(serialize(person2));

        String xmlPerson1 = serialize(person1);
        Person p = deserialize(xmlPerson1, Person.class);

    }

    public static String serialize(Object toSerialize) throws IllegalAccessException {
        StringBuilder output = new StringBuilder();
        final Class<?> aClass = toSerialize.getClass();
        final String objectName = getObjectName(aClass);
        output.append("<" + objectName + ">\n");
        for (Field declaredField : aClass.getDeclaredFields()) {
            declaredField.setAccessible(true);
            if(declaredField.isAnnotationPresent(XmlIgnore.class)){
                continue;
            }
            final String fieldName = getFieldName(declaredField);
            output.append("<" + fieldName + ">" + declaredField.get(toSerialize).toString() + "</" + fieldName + ">\n");
        }
        output.append("</" + objectName + ">\n");

        return output.toString();
    }

    public static <T> T deserialize(String xml, Class<T> tClass) throws IllegalAccessException, InstantiationException {
        T object = tClass.newInstance();
        final Constructor<?>[] constructors = tClass.getConstructors();

        return object;
    }

    private static String getObjectName(Class<?> aClass){
        final XmlTypeName annotation = aClass.getAnnotation(XmlTypeName.class);
        if (annotation != null) {
            return annotation.value();
        }
        return aClass.getSimpleName();
    }

    private static String getFieldName(Field declaredField) {
        final XmlName annotation = declaredField.getAnnotation(XmlName.class);
        if (annotation != null) {
            return annotation.value();
        }
        return declaredField.getName();
    }
}
