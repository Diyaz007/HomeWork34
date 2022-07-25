package B;

public class answer {
    public static void main(String[] args) {
        System.out.println("1) HashCode это ссылка на объект");
        System.out.println("2) HashCode переопределяется для работы с Equals");
        System.out.println("3) HashSet не позволяет добавлять одинаковые объекты");
        System.out.println("4) Значение в HashSet не повторяется, а значение в ArrayList можно повторить.");
        System.out.println("5) List<String> list = new ArrayList<String>();" +
                            "  Set<String> set = new HashSet<String>(list); ");
    }
}
