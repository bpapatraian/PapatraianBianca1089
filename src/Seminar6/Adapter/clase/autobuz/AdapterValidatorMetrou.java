package Seminar6.Adapter.clase.autobuz;

import Seminar6.Adapter.clase.metrou.ValidatorMetrou;

public class AdapterValidatorMetrou  extends ValidatorMetrou implements ValidatorAutobuz {
    @Override
    public void validareBilet() {
        super.validareCalatorie();
    }
}
