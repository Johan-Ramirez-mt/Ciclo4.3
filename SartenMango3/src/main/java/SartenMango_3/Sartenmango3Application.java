package SartenMango_3;


import SartenMango_3.interfaces.InterfaceOrder;
import SartenMango_3.interfaces.InterfaceUser;
import SartenMango_3.modelo.Cookware;
import SartenMango_3.modelo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import SartenMango_3.interfaces.InterfaceCookware;


@Component
@SpringBootApplication

/**
**
*/
public class Sartenmango3Application implements CommandLineRunner {
	@Autowired
	private InterfaceCookware interfaceCook;
	@Autowired
	private InterfaceUser interfaceUser;
	@Autowired
	private InterfaceOrder interfaceOrder;
	public static void main(String[] args) {
		SpringApplication.run(Sartenmango3Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		interfaceCook.deleteAll();
		interfaceUser.deleteAll();
		interfaceOrder.deleteAll();

		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	interfaceUser.saveAll(
				List.of()
		);

	}

}