trait Player {
  var deck : Hand
  var resources : Minerals

  def getPoints: Int
  def getTotalResources: Minerals
}
