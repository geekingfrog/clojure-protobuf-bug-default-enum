package prototest;

import proto.person.PersonOuterClass.Person;
import proto.person.PersonOuterClass.Type;

public class JavaProto {
  public static void main(String[] args) {

    Person test = Person.newBuilder()
      .setName("fooName")
      .setType(Type.foo)
      .build();

    System.out.println("type is: " + test.getType().toString());

    try {
    byte[] bytes = test.toByteArray();
    Person test2 = Person.parseFrom(bytes);
    System.out.println("deserialized: " + test2.toString());
    System.out.println("deserialized type: " + test2.getType().toString());

    } catch (Exception e) {
      System.out.println("got exception!");
      System.out.println(e);
    }
  }
}
