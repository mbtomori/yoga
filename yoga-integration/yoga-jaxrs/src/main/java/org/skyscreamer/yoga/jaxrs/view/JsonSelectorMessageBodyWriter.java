package org.skyscreamer.yoga.jaxrs.view;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.skyscreamer.yoga.view.AbstractYogaView;
import org.skyscreamer.yoga.view.JsonSelectorView;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class JsonSelectorMessageBodyWriter extends AbstractSelectorMessageBodyWriter
{
    @Override
    protected AbstractYogaView getView()
    {
        return new JsonSelectorView();
    }
}
