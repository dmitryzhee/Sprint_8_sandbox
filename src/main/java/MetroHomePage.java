import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MetroHomePage {
  // поле с экземпляром веб драйвера
  private final WebDriver driver;

  // локатор кнопки выпадающего списка городов по имени класса

  private By selectCityButton = By.className("select_metro__button");

  // локатор поля ввода «Откуда» по XPATH, поиск по плейсхолдеру

  private By fieldFrom = By.xpath("//input[@id='uniqs4554']");

  // локатор поля ввода «Куда» по XPATH, поиск по плейсхолдеру

  private By fieldTo = By.xpath("//input[@id='uniqs4555']");

  // локатор коллекций станций «Откуда» и «Куда» маршрута по имени класса

  private By routeStationFromTo = By.className("y-suggest-drop_islet__content _live-events");

  // конструктор класса MetroHomePage с нужным параметром
  public MetroHomePage(WebDriver driver) {
    this.driver=driver;
  }


  // метод ожидания загрузки страницы: проверили видимость станции «Театральная»
  public void waitForLoadHomePage(){
    // подожди 8 секунд, пока появится веб-элемент с нужным текстом
    new WebDriverWait(driver, 8)
            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Театральная']")));
  }

  // метод выбора города по переданному названию
  public void chooseCity(String cityName){
    // кликни по выпадающему списку городов
    driver.findElement(selectCityButton).click();
    // выбери город, переданный в параметре метода
    driver.findElement(By.name(cityName)).click();
  }

  // метод ввода названия станции в поле «Откуда»
  public void setStationFrom(...){
    // введи название станции в поле ввода, а затем с помощью клавиш «Вниз» и Enter выбери его в выпадающем списке саджеста
    driver.findElement(fieldFrom).sendKeys(... Keys.DOWN, Keys.ENTER);
  }

  // метод ввода названия станции в поле «Куда»
  public void setStationTo(...){
    // введи название станции в поле ввода, а затем с помощью клавиш «Вниз» и Enter выбери его в выпадающем списке саджеста
       ...sendKeys(... Keys.DOWN, Keys.ENTER);

  }

  // метод ожидания построения маршрута: проверяется видимость кнопки «Получить ссылку на маршрут»
  public void waitForLoadRoute(){
    // подожди 3 секунды, чтобы элемент с нужным текстом стал видимым
    new WebDriverWait(driver, 3)
               ....;
  }

  // метод построения маршрута
  public void buildRoute(..., ...){
    // указание станции «Откуда»
    setStationFrom(...);
    // указание станции «Куда»
    setStationTo(...);
    // ожидание построения маршрута
        ...
  }

  // метод получения имени станции «Откуда» для построенного маршрута
  public String getRouteStationFrom() {
    // возвращается текст первого элемента коллекции — станции «Откуда» и «Куда»
    return ...(routeStationFromTo)...
  }

  // метод получения имени станции «Куда» построенного маршрута
  public String getRouteStationTo() {
    // возвращается текст второго элемента коллекции — станции «Откуда» и «Куда»
    return ...(routeStationFromTo)...
  }

  // метод получения примерного времени маршрута
  public String getApproximateRouteTime(int routeNumber) {
    // возвращается текст из требуемого по номеру элемента из коллекции времен всех маршрутов
    return driver.findElements(...).get(routeNumber)...;
  }

  // метод проверки с ожиданием видимости станции метро
  public void waitForStationVisibility(... stationName) {
    // ждем видимости элемента с нужным текстом из параметра в течение 8 секунд
    new WebDriverWait(driver, 8)...

  }