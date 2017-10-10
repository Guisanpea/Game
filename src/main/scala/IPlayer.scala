trait IPlayer {
  var deck : IHand
  var resources : Minerals

  def getPoints: Int
  def getTotalResources: Minerals
}
