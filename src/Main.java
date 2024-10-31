import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("Podaj wartosci do wpisania na liste. wpisanie -1 powoduje koniec wczytywania");
        Scanner scanner = new Scanner(System.in);
        Integer value;
        while(true) {
            value = scanner.nextInt();
            if (value == -1){
                break;
            }
            list.addElement(value);
        }
        list.display();
        System.out.println();
        System.out.println("-----------------------------");
        list.removeElement();
        list.display();
        System.out.println();
        System.out.println("-----------------------------");
        list.getElement(5);
        System.out.println();
    }
}