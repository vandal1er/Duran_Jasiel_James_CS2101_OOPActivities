
class Menu
{
    String name = "Menu";
    
    public void Initialize()
    {
        System.out.println("Menu");
    }
    
    public void Rename(String n)
    {
        name = n;
    }
    
    public void OpenMenu(Menu menu)
    {
        menu.Initialize();
    }
}

public class Interface{
  public static void main(String args[]) {

    Menu menu1 = new Menu();

    menu1.Initialize();
    
  }
}

