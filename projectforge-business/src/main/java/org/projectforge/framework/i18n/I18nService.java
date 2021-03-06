package org.projectforge.framework.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by mhesse on 24.03.16.
 */
public interface I18nService
{
  void loadResourceBundles();

  String getLocalizedStringForKey(String i18nKey, Locale locale);

  ResourceBundle getResourceBundleFor(String name, Locale locale);

  String getAdditionalString(String key, Locale locale);
}
