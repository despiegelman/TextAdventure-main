public class Player
{
  String name;
  int cheese;
  int crackers;
  int neededCheese;

  public Player(String playerName, int startingCheese, int startingCrackers)
  {
    name = playerName;
    cheese = startingCheese;
    crackers = startingCrackers;
    neededCheese = crackers - cheese;
  }

  public String getName()
  {
    return name;
  }

  public void changeName(String newName)
  {
    name = newName;
  }

  public int getCheese()
  {
    return cheese;
  }

  public void setCheese(int newCheese)
  {
    cheese = newCheese;
  }

  public int getCrackers()
  {
    return crackers;
  }

  public void setCrackers(int newAmount)
  {
    crackers = newAmount;
  }

  public int getCheeseNeeded()
  {
    neededCheese = (crackers - cheese);
    return neededCheese;
  }
}