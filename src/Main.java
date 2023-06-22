public class Main {
  public static void main(String[] args) {
    int ticketCost = 13676; // Стоимость билета
    int milesPerRuble = 20; // Количество рублей для одной бонусной мили
    
    int bonusMiles = ticketCost / milesPerRuble; // Расчет количества бонусных миль
    
    System.out.println("Количество начисленных миль: " + bonusMiles);
  }
}
