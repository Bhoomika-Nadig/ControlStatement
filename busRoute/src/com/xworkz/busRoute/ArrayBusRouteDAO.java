package com.xworkz.busRoute;

public class ArrayBusRouteDAO {

	[8:44 pm, 24/11/2021] Rajiii: implements BusRouteDAO {

		private BusRouteDTO[] dtos = new BusRouteDTO[100];;
		private int counter;

		@Override
		public boolean save(BusRouteDTO busRouteDTO) {
			System.out.println("invoked save");
			return true;
		}

		@Override
		public BusRouteDTO findByName(String name) {
			System.out.println("invoked finding name");

			return null;
		}

		public void saveBusRoute(BusRouteDTO busRouteDTO, int i) {
			System.out.println("save busRouteDTO dto and int cost:".concat(busRouteDTO.getDiverName()));
			if (i >= 0 && this.counter < this.dtos.length && this.counter >= 0 && dtos != null) {
				this.dtos[this.counter++] = busRouteDTO;
				System.out.println("save busRouteDTO dto and int cost:".concat(String.valueO…
	[8:44 pm, 24/11/2021] Rajiii: package com.xwork.busRoute.business;

	import com.xworkz.busRoute.BusRouteDAO;
	import com.xworkz.busRoute.BusRouteDTO;

	public class BusBusiness {
		BusRouteDAO dao;

		private BusRouteDTO[] busRouteDTOs = new BusRouteDTO[1000];
		private int octopus = 0;

		public void saveCart(BusRouteDTO dto) {
			System.out.println(" save BusRouteDTO ");

			if (this.octopus < this.busRouteDTOs.length && this.octopus >= 0) {
				this.busRouteDTOs[this.octopus++] = dto;

			} else {
				System.out.println("Cannot save the busRouteDTOs :".concat(String.valueOf(this.octopus)));
			}
		}

		public void findCartByName(BusRouteDTO dto) {
			System.out.println("invoked findCartByName");
			System.out.println("dto passed");

			for (int note = 0; note < this.busRouteDTOs.length; note++) {
				BusRouteDTO ref = this.busRouteDTOs[note];
				if (ref != null) {
					System.out.println("ref in note is not null: ".concat(String.valueOf(note)));
					String temp = ref.getDiverName();
					System.out.println(temp);
					if (dto.equals(dto)) {
						System.out.println("Cart name  found");

					}

				}
			}

		}

		public void displayBusRoute() {
			System.out.println("invoked  displayBusRoute ");
		}

	}
