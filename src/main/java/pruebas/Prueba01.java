package pruebas;

import java.util.List;

import dao.RolDAO;
import dao.RolDAOImplement;
import model.Rol;

public class Prueba01 {

	public static void main(String[] args) {
		
		RolDAO rol = new RolDAOImplement();
		List<Rol> lista = rol.findAll();
		for (Rol r: lista) {
			System.out.println(r.getIdrol());
			System.out.println(r.getRolname());
			System.out.println(r.getRolstatus());
		}
	}

}
