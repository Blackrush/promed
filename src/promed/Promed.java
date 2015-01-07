package promed;

public class Promed {
    public static void main(String[] args) {
        DirReg dir = new DirReg();
        dir.setSmic(2000.00);
        dir.setPrimeMultiplier(100.00);
        dir.setRegion("Haute-Normandie");

        Vm vm = new Vm("Seine-Maritime", "senior");
        vm.setSmic(1500.00);
        vm.setPrimeMultiplier(10.00);
        vm.addMedicament(new Medicament("Viagra", 5.00, 4.50, "huehuehue", "huehuehue"));
        vm.addMedicament(new Medicament("Viagra", 5.00, 4.50, "huehuehue", "huehuehue"));
        vm.addMedicament(new Medicament("Viagra", 5.00, 4.50, "huehuehue", "huehuehue"));
        vm.addMedicament(new Medicament("Viagra", 5.00, 4.50, "huehuehue", "huehuehue"));

        dir.dirige(vm);

        ServicePaye sp = new ServicePaye();
        sp.setPrimeParMedoc(1.00);

        double dirPaye = sp.calcPaye(dir);
        System.out.printf("le directeur sera payé %.02f€\n", dirPaye);

        double vmPaye = sp.calcPaye(vm);
        System.out.printf("le vm sera payé %.02f€\n", vmPaye);
    }
}
