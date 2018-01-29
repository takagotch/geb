import geb_Page

class ReserveErrorPage extends Page{
  static at = { title === "EER" }
  static content = {
    message { $("#errorcheck_result") }
  }
}

