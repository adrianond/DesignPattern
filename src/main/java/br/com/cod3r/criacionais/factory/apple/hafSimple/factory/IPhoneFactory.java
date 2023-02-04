package br.com.cod3r.criacionais.factory.apple.hafSimple.factory;

import br.com.cod3r.criacionais.factory.apple.hafSimple.model.IPhone;

public abstract class IPhoneFactory {

	public IPhone createDevice(String model) {
		IPhone device = null;

		device = buildIPhone(model);
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;

	}

    /**
     * Factory Method
     * @return
     */
	protected abstract IPhone buildIPhone(String model);

}
