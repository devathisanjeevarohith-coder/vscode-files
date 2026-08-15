class WrapperExample{
    public static void main(String[] args){
        Integer i = 10;
        int num = i;
        System.out.println(i+ " "+num);

        String price = "1000";
        int p = Integer.parseInt(price);
        System.out.println(price+ " "+p);

        int a = 10;
        @SuppressWarnings("UnnecessaryBoxing")
        Integer obj = Integer.valueOf(a);
        System.out.println(a+ " "+obj);
        int b = obj;
        System.out.println(obj+ " "+b);  
    }
}
