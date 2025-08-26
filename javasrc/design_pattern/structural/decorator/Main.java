package decorator;

class Main {
    public static void main(String[] args) {
        Pizza mwec = new ExtraCheese(new Margehrita());
        Pizza mwech = new ExtraChilly(new Margehrita());
        
        System.out.println(mwec.getName() + " Cost:" +  mwec.getCost());
        System.out.println(mwech.getName() + " Cost:" + mwech.getCost());
    }
}