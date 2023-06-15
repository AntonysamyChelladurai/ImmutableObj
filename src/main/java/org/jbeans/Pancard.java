package org.jbeans;

import lombok.Getter;

/**
 * Hello world!
 *
 */

@Getter
final class Pancard
{
    private final String id;
    private final String name;
    private final String lname;

    public Pancard(String id, String name, String lname) {
        this.id = id;
        this.name = name;
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Pancard{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return name == null ? 0 : name.hashCode();
    }

    public static void main(String[] args )
    {
        System.out.println( "Hello World!" );
        Pancard pancard1=new Pancard("APA22CC2","ANTONY","CHELLADURAI");
        Pancard pancard2=new Pancard("APA22CC2","ANTONY","CHELLADURAI");
        Pancard pancard3=new Pancard("APA25CC2","samy","CHELLADURAI");
        System.out.println("Pancard 1 :: "+ pancard1+ "  "+pancard1.hashCode());
        System.out.println("Pancard 2 :: "+ pancard2+ "  "+pancard2.hashCode());
        System.out.println("Pancard 3 :: "+ pancard3+ "  "+pancard3.hashCode());

        String s1="Antony";
        String s2="Antony";
        String s3="samy";
        String s4=new String("Antony");
        String s5=new String("Antony");
        //String s3="samy";

        System.out.println("S1 :: "+ s1+ "  "+s1.hashCode());
        System.out.println("S2 :: "+ s2+ "  "+s2.hashCode());
        System.out.println("S3 :: "+ s3+ "  "+s3.hashCode());
        System.out.println("S4 :: "+ s4+ "  "+s4.hashCode());
        System.out.println("S5 :: "+ s5+ "  "+s5.hashCode());
    }
}
