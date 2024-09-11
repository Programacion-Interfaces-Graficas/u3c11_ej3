package u3c11_ej3;
//Definición de la clase nuevoHilo que implementa la interfaz Runnable
class nuevoHilo implements Runnable {
    public Thread hilo;
	// Definición de la clase nuevoHilo que implemente la interfaz Runnable
    public nuevoHilo() {
        hilo=new Thread(this,"nuevoHilo");
        // Llama al constructor de la clase Thread con el nombre "Nuevo Hilo"
        System.out.println("subproceso:" + this);
    }
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("subproceso: " + i);
                Thread.sleep(500);
                // Hace una pausa de 500 milisegundos (0.5 segundos) en cada iteración del bucle
            }
        } catch (InterruptedException e) {
            System.out.println("nuevoHilo interrupted.");
        }
        System.out.println("nuevoHilo Finalizado");
    }
}
class ejemplo3 {
	public static void main(String[] args) {
		// Crea una nueva instancia de la clase nuevoHilo. 
		// Esto inicializa un nuevo objeto de tipo nuevoHilo.
		nuevoHilo nh=new nuevoHilo();
		// Llama al método start() del Thread creado en el objeto nh, que inicia la ejecución del hilo nuevoHilo. 
		//Esto hace que se llame al método run() del hilo en un nuevo hilo de ejecución.
	    nh.hilo.start();
	    //Ejecuta el hilo principal
		try {
			 for(int i = 5; i > 0; i--) {
			 System.out.println("Hilo Principal: " + i);
			 Thread.sleep(1000);
			 }
		} catch (InterruptedException e) {
			 System.out.println("Hilo Principal interrupted.");
		}
			 System.out.println("Hilo Principal Finalizado");
	}
}
