import java.util.Scanner; 
class a2015{
    public static void main(String[] args){
        module ecs401 = new module();
        ecs401.name = "ECS401";
        ecs401.info = "Module ECS401 is called Procedural Programming and is on Monday";
        module ecs402 = new module();
        ecs402.name = "ECS402";
        ecs402.info = "Module ECS402 is called Professional and Research Themes and is on Tuesday";
        module ecs403 = new module();
        ecs403.name = "ECS403";
        ecs403.info = "Module ECS403 is called Communications and Networks and is on Wednesday.";
        module ecs407 = new module();
        ecs407.name = "ECS407";
        ecs407.info = "Module ECS407 is called Logic and Discrete Structures and is on Friday";
        menu(ecs401,ecs402,ecs403,ecs407);
    }

    public static void menu(module ecs401, module ecs402,module ecs403,module ecs407){
        String modCode = "0";
        while (!(modCode.equals("XXX"))){
            modCode = input("Module Code: ");
            System.out.println(search(modCode,ecs401,ecs402,ecs403,ecs407));
        }
        return;
    }

    public static String search(String modCode, module ecs401, module ecs402,module ecs403,module ecs407){
        if (modCode.equals(ecs401.name)){
            return ecs401.info;
        }
        else if (modCode.equals(ecs402.name)){
            return ecs402.info;
        }
        else if (modCode.equals(ecs403.name)){
            return ecs403.info;
        }
        else if (modCode.equals(ecs407.name)){
            return ecs407.info;
        }
        else if(modCode.equals("XXX")){
            return "Goodbye";
        }
        else{
            return "There is no such module";
        }
    }


    public static String input(String m){
        System.out.println(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
class module{
    String name;
    String info;
}