package measure.repository;

import measure.model.QuantityMeasurementEntity;

import java.sql.*;
import java.util.*;

public interface IQuantityMeasurementRepository {
	void save(QuantityMeasurementEntity enity);
    List<QuantityMeasurementEntity> getAllMeasurement();
    List<QuantityMeasurementEntity> getMeasurementByOperation(String Operation);
    List<QuantityMeasurementEntity> getMeasurementByType(String type);
    int getTotalCount();
    void deleteALl();
    String getPoolStatistic();
    void releaseResource();
}
