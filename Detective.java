import java.util.ArrayList;
class ToDos {
  public static void main(String[] args) {
    // Sherlock
    ArrayList<String>
            sherlocksToDos = new ArrayList<String>();
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");

public static void main(String[] args) {
      poirotsToDos.add("reveal the truth of the crime");
      // Print the size of each ArrayList below:
      System.out.println("sherlocksToDo's size: "+ sherlocksToDos.size());
      System.out.println("poirotsToDo's size: "+ poirotsToDos.size());
      // Print the name of the detective with the larger to-do list:
      if(poirotsToDos.size()<sherlocksToDos.size()){
        System.out.println("Sherlock has more things to do");
      }
      else if(poirotsToDos.size()>sherlocksToDos.size()){
        System.out.println("Poirot has more things to do");
      } else if(poirotsToDos.size()==sherlocksToDos.size())
      { System.out.println("both detectives have same amount of things to do"); }
    }
  }
    }
  }
  }
