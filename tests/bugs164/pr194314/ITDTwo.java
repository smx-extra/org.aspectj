interface I {

} 

class C implements I {

  public void m() {
    foo(null,1,null);
  }
}

aspect X {
  void around(): call(* foo(..)) {}
  public void I.foo(String s,int i,String[] ss) {}
}
