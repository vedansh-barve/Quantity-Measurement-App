package measure;
public enum VolumeUnit implements IMeasurable {
	LITRE(1.0),
	MILLITRE(0.001),
	GALLON(3.78541);
	
	private double conversion;
	
	VolumeUnit(double conversion){
		this.conversion = conversion;
	}
	
	@Override
	public double getConversionFactor() {
		return conversion;
	}
	
	@Override
	public double convertToBaseUnit(double value) {
		return value*this.getConversionFactor();
	}
	
	@Override
	public double convertFromBaseUnit(double baseValue) {
		return (VolumeUnit.LITRE.getConversionFactor()*baseValue) / this.getConversionFactor();
	}
	
	@Override
	public String getUnitName() {
		return VolumeUnit.this.name();
	}
}
