package br.com.cod3r.criacionais.factory.apple.after.factory;

import br.com.cod3r.criacionais.factory.apple.after.model.IPhone;

public abstract class IPhoneFactory {

	public IPhone createDevice() {
		IPhone device = null;

		device = buildIPhone();
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
	protected abstract IPhone buildIPhone();

}
