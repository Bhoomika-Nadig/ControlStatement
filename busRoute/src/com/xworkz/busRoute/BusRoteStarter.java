package com.xworkz.busRoute;
import com.xworkz.busRoute.ArrayBusRouteDAO;
import com.xworkz.busRoute.BusRouteDTO;


public class BusRoteStarter {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			BusRouteDTO busRouteDTOs1 = new BusRouteDTO("25A", "BTM","Mejestic","Suresh");
			ArrayBusRouteDAO dto1 = new ArrayBusRouteDAO();
			dto1.save(busRouteDTOs1);

			dto1.saveBusRoute(new BusRouteDTO("600a", "BTM","Jayanagara","Ram"), 3);

			BusRouteDTO ref = dto1.findByName("25A");
			System.out.println(ref);

			ArrayBusRouteDAO arrayBusRouteDAO = new ArrayBusRouteDAO();
			System.out.println(arrayBusRouteDAO.save(busRouteDTOs1));
			System.out.println(arrayBusRouteDAO.findByName("25A"));
			arrayBusRouteDAO.displayAllBusDetails();

		}

	}


