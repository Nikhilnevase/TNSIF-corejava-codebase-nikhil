package AcceseMobifiers;

public class modifierpublic {
	// variables  with different access modifiers 
	public int varpublic =10;
	private int varprivate = 20;
	protected int varprotected =30;
            int  vardefault = 40;
            
            //Functions of different access modifiers
            public void methodpublic() {
            	System.out.println("This is public  variable ");
            	System.out.println(varpublic);
            	
            }
             private void methodprivate() {
            	 System.out.println("This is private variable ");
            	 System.out.println(varprivate);
             }
             protected void methodprotected() {
            	 System.out.println("This is protected  variable ");
            	 System.out.println(varprotected);
             }
             
              void methodDefault() {
            	  System.out.println("This is default   variable ");
            	  System.out.println(vardefault);
              }
             

}
