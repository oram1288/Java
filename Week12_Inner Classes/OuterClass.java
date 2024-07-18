public class OuterClass{
    //private
    private String msg;
    OuterClass()
    {
        this.msg = "This is OuterClass Constructor";
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }
    public void displayOC()
    {
        System.out.println("Inside display method of Outer Class: Message = " + msg);
        innerClass IC = new innerClass();
        System.out.println("Message from the inner class " + IC.InMsg);
        IC.displayIC();
        IC.PrivateMethodIC();
    }
    private void PrivateMethod()
    {
        System.out.println("Private Method of OuterClass");
    }

        // We can access both public and private data and methods from inner class but we need object reference for that
    public class innerClass{
        // We can access both public and private data and methods from the outclass
        private String InMsg;
        innerClass()
        {
            this.InMsg = "THis is inner class constructor";
        }

        public void setInMsg(String inMsg) {
            InMsg = inMsg;
        }
        public String getInMsg() {
            return InMsg;
        }
       public void displayIC()
       {
        System.out.println("Display method of Inner Class " + InMsg);
        System.out.println("Display Method of Outer Class");
        displayOC();
        System.out.println("Message of the outclass accessed from inner class: " + msg);
        PrivateMethod();
       }
       private void PrivateMethodIC()
       {
        System.out.println("Private method of the inner class");
       }

    }
}