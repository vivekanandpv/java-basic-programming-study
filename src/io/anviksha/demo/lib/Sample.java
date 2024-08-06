package io.anviksha.demo.lib;

//  at the type level, public and no modifier are allowed
//  public is visible across packages
//  no modifier is visible only within the package
public class Sample {
    //  a member can be public, private, and protected
    //  if the member and type have different modifiers, the most restrictive one will win

    //  private can only be applied to members (fields, constructors, methods)
    //  private members are visible only within the type

    //  public members are visible to all

    //  protected can only be applied to members (fields, constructors, methods)
    //  these members are public within the package, but visible to subclasses of other packages
    //  static members can be protected
    //  final and protected can be used together
    private String token;
    public String city;
    protected String email;

    private Sample() {
    }

    public Sample(String token, String city, String email) {
        this.token = token;
        this.city = city;
        this.email = email;
    }

    protected Sample(String token) {
        this.token = token;
    }

    private void foo() { }

    public void bar() { }

    protected void baz() { }
}



