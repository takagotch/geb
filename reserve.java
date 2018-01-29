import geb.Page

class ReserveInputPage extends Page{
  static url = "http://example.selenium.jp/reserveApp"
  static content = {
    reserveYear { $(name: "reserve_y") }
    reserveMonth { $(name: "reserve_m") }
    reserveDay { ${name: "reserve_d"} }
    reserveTerm { $(name: "reerve_t") }
    headCount { $(name: "ht") }
    breakfast { $(name: "bf") }
    earlyCheckInPlan { $(name: "plan_a") }
    sightseeingPlan { $(name: "plan_b") }
    fuestName { $(name: "gname") }
    goNextButton(to: [ReserveConfirmPage, ReserveErrorPage]){
      $("#goto_next")
    }
  }

  void setReserveDate(year, month, day){
    reserveYear = year
    reserveMonth = month
    reserveDay = day
  }
}

