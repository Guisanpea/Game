trait Card {
  val level: Int
  val cost: Minerals
  def getPoints: Int
  def purchase(money: Minerals): Boolean
  def getCost: Minerals
}
