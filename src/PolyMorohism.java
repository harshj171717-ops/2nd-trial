public class PolyMorohism {
    public static class Animal {
        String name;
        int legs;
        String colour;
        Animal (String a, int b, String c){
            name = a;
            legs=b;
            colour=c;
        }
        Animal (){
            name = "unknown";
            legs=99;
            colour="black";
        }

        public void print(){
        System.out.println(name +" "+legs+" "+colour);
    }

    }
    public static void main(String[] args) {
//       Animal a1 = new Animal();
//       a1.colour="Yellow";
//       a1.name="Lion";
//       a1.legs=4;


        Animal a = new Animal("hen" ,2,"red");
        Animal b = new Animal();
    a.print();
    b.print();;
    }
}
