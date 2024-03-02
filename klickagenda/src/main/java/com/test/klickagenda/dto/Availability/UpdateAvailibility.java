package com.test.klickagenda.dto.Availability;

import com.test.klickagenda.entity.Availiability;
import com.test.klickagenda.entity.AvailiabilityId;
import com.test.klickagenda.entity.User;

public class UpdateAvailibility {

    private AvailiabilityId id;

    private String dia;

    public void update(Availiability availiability) {
        //availiability.setId(AvailiabilityId.valueOf(id));
        availiability.setDiaSemana(String.valueOf(dia));
    }
}
