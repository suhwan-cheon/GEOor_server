package shp;

import org.geotools.data.FeatureSource;
import org.geotools.feature.FeatureCollection;
import org.geotools.feature.FeatureIterator;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;
import org.opengis.feature.type.AttributeDescriptor;

import java.util.List;

/**
 * 출력역할만 함
 */
public class ShpMapper {

    private FeatureSource<SimpleFeatureType, SimpleFeature> source;
    private FeatureCollection<SimpleFeatureType, SimpleFeature> collection;

    public ShpMapper(Shp shp) {
        source = shp.getSource();
        collection = shp.getCollection();
    }

    // 맨 위 하나만 출력
    public void printAttributes() {
        // attribute 추출
        List<AttributeDescriptor> Attributes = source.getSchema().getAttributeDescriptors();
        int attributeCount = source.getSchema().getAttributeCount();

        try (FeatureIterator<SimpleFeature> features = collection.features()) {
            SimpleFeature feature = features.next();
            // tuple 추출
            List<Object> values = feature.getAttributes();
            for (int i = 0; i < attributeCount; i++) {
                System.out.println(Attributes.get(i).getLocalName() + " : " + values.get(i));
            }
        }
    }
}
