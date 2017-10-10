class Card(_points: Int, _cost: Minerals, var _level: Int) extends ICard{
  override val level: Int = _level
  override val cost: Minerals = _cost
  override val points: Int = _points

}
