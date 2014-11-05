package ship;

public class Basilisk extends Ship {
	public Basilisk() {
		
		currentReactorCapacity = 11;
		
		shipCrew.add(new crew.Mantis());
		shipCrew.add(new crew.Mantis());
		
		installedSystems.put(system.SystemEnum.SHIELDS, new system.Shields());
		installedSystems.put(system.SystemEnum.ENGINES, new system.Engines());
		installedSystems.put(system.SystemEnum.OXYGEN, new system.Oxygen());
		installedSystems.put(system.SystemEnum.WEAPONS, new system.Weapons());
		installedSystems.put(system.SystemEnum.MEDBAY, new system.Medbay());
		installedSystems.put(system.SystemEnum.DRONES, new system.Drones());
		installedSystems.put(system.SystemEnum.TELEPORTER, new system.Teleporter());
		installedSystems.put(system.SystemEnum.PILOTING, new system.Piloting());
		installedSystems.put(system.SystemEnum.SENSORS, new system.Sensors());
		installedSystems.put(system.SystemEnum.DOORS, new system.Doors());
		
		installedAugmentations[0] = new augmentation.MantisPheromones();	
		
		fuel = 16;
		missiles = 0;
		droneParts = 15;
		
		// 3 max weps, 2 max drones
		// no starting weapons, starting drones boarding, defense I
	}
}
