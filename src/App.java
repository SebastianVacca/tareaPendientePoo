public class App {
    public static void main(String[] args) throws Exception {
        var task = new Tarea("Hacer aseo", 1);

        System.out.println(task.showState());
        task.setMarkCompleted();

        System.out.println(task.showState());
    }
}
