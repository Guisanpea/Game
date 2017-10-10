class Board(allCards: List[List[ICard]], mineralNumber: Int) extends IBoard{
  override val levelOneCards: List[ICard] = allCards(1)
  override val levelTwoCards: List[ICard] = allCards(2)
  override val levelThreeCards: List[ICard] = allCards(3)
  override val nobleCards: List[ICard] = allCards(0)
  override val avaliableResources: Minerals =
    Minerals(mineralNumber,mineralNumber,mineralNumber, mineralNumber, 5);
}
