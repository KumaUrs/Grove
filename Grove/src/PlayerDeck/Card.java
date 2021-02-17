package PlayerDeck;

public class Card 
{

	public Card(String name, String description, 
			byte cost, byte affinity, Range range, SpellType spellType, Element elementType) 
	{
		this.name=name;
		this.description=description;
		this.manaCost=cost;
		this.affinity=affinity;
		this.spellRange=range;
		this.spellType=spellType;
		this.elementalType=elementType;
		
		
	}


	String name;
	String description;
	
	
	byte manaCost;
	byte affinity;
	
	
	Element elementalType;
	SpellType spellType;
	Range spellRange;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the manaCost
	 */
	public byte getManaCost() {
		return manaCost;
	}
	/**
	 * @param manaCost the manaCost to set
	 */
	public void setManaCost(byte manaCost) {
		this.manaCost = manaCost;
	}
	/**
	 * @return the affinity
	 */
	public byte getAffinity() {
		return affinity;
	}
	/**
	 * @param affinity the affinity to set
	 */
	public void setAffinity(byte affinity) {
		this.affinity = affinity;
	}
	/**
	 * @return the elementalType
	 */
	public Element getElementalType() {
		return elementalType;
	}
	/**
	 * @param elementalType the elementalType to set
	 */
	public void setElementalType(Element elementalType) {
		this.elementalType = elementalType;
	}
	/**
	 * @return the spellType
	 */
	public SpellType getSpellType() {
		return spellType;
	}
	/**
	 * @param spellType the spellType to set
	 */
	public void setSpellType(SpellType spellType) {
		this.spellType = spellType;
	}
	/**
	 * @return the spellRange
	 */
	public Range getSpellRange() {
		return spellRange;
	}
	/**
	 * @param spellRange the spellRange to set
	 */
	public void setSpellRange(Range spellRange) {
		this.spellRange = spellRange;
	}
	
	@SuppressWarnings("rawtypes")
	public String convertEnum(Enum s)
	{
	  return String.format("%s", s).toLowerCase();	
	}
	
	@Override
	public String toString()
	{
		return String.format("Card Name: %s Card Desc: %s Cost:%x "
				+ "Elemental Affinity: %x Spell Type: %s Spell Range:%s Elemental Type: %s"
				, getName(), 	getDescription(),
				getManaCost(), getAffinity(), convertEnum(getSpellType())
				, convertEnum(getSpellRange()), convertEnum(getElementalType()));
	}
	
}
