class GebSampleTest extends GebTests{
  
  private static Calendar nextSaturday(){
    //...
  }

  @Test
  void SUCCESS(){
    to ReserveInutPage
    Calendar nextSaturday = nextSaturday()
    setReserveDate(nextSaturday.get(Calendar.YEAR),
      nextSaturday.get(Calendar.MONTH) + 1,
      nextSaturday.get(Calendar.DATE))
    reserveTerm = "1"
    headCount = "2"
    breakfast = "on"
    earlyCheckPlan = true
    guestName = "USER"
    goNextButton.click()

    at ReserveConfirmPage
    assertThat(price.text(), is("21500"))
    commitButton.click()
  }

  @Test
  void EER(){
    to ReserveInput
    setReserveDate("1999", "1", "1")
    guestName = "USER"
    goNextButton.click()

    at ReserveErrorPage
    assertThat(message().text(),
      is("input date plz"))
  }
}

