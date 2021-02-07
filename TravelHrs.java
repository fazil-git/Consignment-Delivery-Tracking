package consignmentDeliveryTracking;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
public @interface TravelHrs {
	int value();
}

class Resource{
	@TravelHrs(value=5)
	int travelHrs;
	static Resource obj;
	
	private Resource() {
	}
	static Resource createObject() {
		if(obj==null) obj=new Resource();
		return obj;
	}
}

class ResourceFactory{
	public static Resource getResource() {
		Resource r=Resource.createObject();
		Field f = null;
		try { f = r.getClass().getDeclaredField("travelHrs"); } catch (Exception e) {}
		f.setAccessible(true);
		TravelHrs tH=f.getAnnotation(TravelHrs.class);
		if(tH!=null) r.travelHrs=tH.value();
		return r;
	}
}