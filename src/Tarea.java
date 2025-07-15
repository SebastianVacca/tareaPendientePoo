public class Tarea {
    //Atributos
    private String description;
    private Integer priority;
    private Boolean completed = false;

    //Constructores
    public Tarea(String description){
        this(description, 2);
    }
    public Tarea(String description, Integer priority){
        this.description = description;
        if (priority >= 1 && priority <= 3) {
            this.priority = priority;
        } else {
            System.out.println("Error");
        }
    }

    //Métodos
    public String showState(){
        return String.format("Tarea: %s%nPrioridad: %d%nCompletada: %s",
                getDescription(), getPriority(), completed ? "Si" : "No");
    }

    //getters
    public String getDescription(){
        return this.description;
    }
    public Integer getPriority(){
        return this.priority;
    }
     public Boolean isCompleted(){
        return this.completed;
    } 

    //setters
    public void setPriority(int newPriority){
        this.priority = newPriority;
    }
    public void setMarkCompleted(){
        if (!completed) {
            this.completed = true;
        }  
    }
    
}
