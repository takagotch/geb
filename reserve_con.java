import geb.Page

class ReserveConfirmPage extends Page{
  static at = { title == "r_confirm"}
  static content = {
    price { $("#price") }
    conmmitButton { $("#commit") }
  }
}

