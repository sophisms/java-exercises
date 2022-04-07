
public class Proveedor implements Pagable{
	String razonSocial;
	int cantidad;
	double precioUnitario;
	
	public Proveedor(String razonSocial, int cantidad, double precioUnitario) {
		super();
		this.razonSocial = razonSocial;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}//constructor

	public String getRazonSocial() {
		return razonSocial;
	}//getRazonSocial

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}//setRazonSocial

	public int getCantidad() {
		return cantidad;
	}//getCantidad

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}//setCantidad

	public double getPrecioUnitario() {
		return precioUnitario;
	}//getPrecioUnitario

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}//setPrecioUnitario

	@Override
	public String toString() {
		return "Proveedor [razonSocial=" + razonSocial + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
				+ "]";
	}//toString

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return (getCantidad() * getPrecioUnitario()) * 1.16;
	}//calculateSalary
}//class Proveedor
