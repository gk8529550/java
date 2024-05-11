class inherit{
    public static void main(String[] args){
        Mammal anonymous=new Mammal();
        human  tom=new human();
        anonymous.weight=12.5;
        tom.weight=50.3;
        tom.howsilly="a lot of silly";
        System.out.println("wt of anonymous:" +anonymous.weight);
        System.out.println("this is how anonymous moves:");
        anonymous.moves();
        System.out.println("wt of tom:"+tom.weight);
        System.out.println("this is how tom moves:");
        tom.moves();
        System.out.println("tom is"+tom.howsilly);
        System.out.println("this is how tom speaks:");
        tom.speaks();
    }
}