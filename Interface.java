
class Menu
{
    private string name = "Menu";
    
    public void Initialize()
    {
        System.out.println("Menu");
    }
    
    public void Rename(string n)
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

    
    menu1.Initialize();
  }
}

