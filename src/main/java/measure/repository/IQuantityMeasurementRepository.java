package measure.repository;

import measure.model.QuantityMeasurementEntity;
import java.util.*;

public interface IQuantityMeasurementRepository {
	void save(QuantityMeasurementEntity enity);
    List<QuantityMeasurementEntity> getAllMeasurement();
}
