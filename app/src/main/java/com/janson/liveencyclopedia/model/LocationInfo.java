package com.janson.liveencyclopedia.model;

import java.util.List;

/**
 * Created by janson on 15-12-14.
 */
public class LocationInfo {


    /**
     * results : [{"address_components":[{"long_name":"182","short_name":"182","types":["street_number"]},{"long_name":"海城路","short_name":"海城路","types":["route"]},{"long_name":"宝安区","short_name":"宝安区","types":["sublocality_level_1","sublocality","political"]},{"long_name":"深圳","short_name":"深圳","types":["locality","political"]},{"long_name":"广东省","short_name":"广东省","types":["administrative_area_level_1","political"]},{"long_name":"中国","short_name":"CN","types":["country","political"]},{"long_name":"518102","short_name":"518102","types":["postal_code"]}],"formatted_address":"中国广东省深圳市宝安区海城路182号 邮政编码: 518102","geometry":{"location":{"lat":22.567733,"lng":113.869204},"location_type":"ROOFTOP","viewport":{"northeast":{"lat":22.5690819802915,"lng":113.8705529802915},"southwest":{"lat":22.5663840197085,"lng":113.8678550197085}}},"place_id":"ChIJyepNQwXsAzQRqm-ApqqcuqA","types":["street_address"]},{"address_components":[{"long_name":"宝安区","short_name":"宝安区","types":["sublocality_level_1","sublocality","political"]},{"long_name":"深圳","short_name":"深圳","types":["locality","political"]},{"long_name":"广东省","short_name":"广东省","types":["administrative_area_level_1","political"]},{"long_name":"中国","short_name":"CN","types":["country","political"]}],"formatted_address":"中国广东省深圳市宝安区","geometry":{"bounds":{"northeast":{"lat":22.8617484,"lng":114.1133667},"southwest":{"lat":22.5264159,"lng":113.7514535}},"location":{"lat":22.555259,"lng":113.88402},"location_type":"APPROXIMATE","viewport":{"northeast":{"lat":22.8617484,"lng":114.1133667},"southwest":{"lat":22.5264159,"lng":113.7514535}}},"place_id":"ChIJzyoujG6SAzQRRD3Jr26PFfM","types":["sublocality_level_1","sublocality","political"]},{"address_components":[{"long_name":"深圳","short_name":"深圳","types":["locality","political"]},{"long_name":"广东省","short_name":"广东省","types":["administrative_area_level_1","political"]},{"long_name":"中国","short_name":"CN","types":["country","political"]}],"formatted_address":"中国广东省深圳市","geometry":{"bounds":{"northeast":{"lat":22.8617484,"lng":114.6272961},"southwest":{"lat":22.445027,"lng":113.7569183}},"location":{"lat":22.543099,"lng":114.057868},"location_type":"APPROXIMATE","viewport":{"northeast":{"lat":22.7809313,"lng":114.3553162},"southwest":{"lat":22.3293893,"lng":113.7524414}}},"place_id":"ChIJkVLh0Aj0AzQRyYCStw1V7v0","types":["locality","political"]},{"address_components":[{"long_name":"518100","short_name":"518100","types":["postal_code"]},{"long_name":"宝安区","short_name":"宝安区","types":["sublocality_level_1","sublocality","political"]},{"long_name":"深圳","short_name":"深圳","types":["locality","political"]},{"long_name":"广东省","short_name":"广东省","types":["administrative_area_level_1","political"]},{"long_name":"中国","short_name":"CN","types":["country","political"]}],"formatted_address":"中国广东省深圳市宝安区 邮政编码: 518100","geometry":{"bounds":{"northeast":{"lat":22.5873544,"lng":113.9090367},"southwest":{"lat":22.5514865,"lng":113.8584738}},"location":{"lat":22.5643086,"lng":113.8822415},"location_type":"APPROXIMATE","viewport":{"northeast":{"lat":22.5813106,"lng":113.9090367},"southwest":{"lat":22.5514865,"lng":113.8584738}}},"place_id":"ChIJvblWDmrsAzQRwZB-VG3qkZo","types":["postal_code"]},{"address_components":[{"long_name":"518102","short_name":"518102","types":["postal_code"]},{"long_name":"宝安区","short_name":"宝安区","types":["sublocality_level_1","sublocality","political"]},{"long_name":"深圳","short_name":"深圳","types":["locality","political"]},{"long_name":"广东省","short_name":"广东省","types":["administrative_area_level_1","political"]},{"long_name":"中国","short_name":"CN","types":["country","political"]}],"formatted_address":"中国广东省深圳市宝安区 邮政编码: 518102","geometry":{"bounds":{"northeast":{"lat":22.6430468,"lng":113.9016013},"southwest":{"lat":22.5542873,"lng":113.8212919}},"location":{"lat":22.5958775,"lng":113.8483038},"location_type":"APPROXIMATE","viewport":{"northeast":{"lat":22.616014,"lng":113.9016013},"southwest":{"lat":22.5542873,"lng":113.8331902}}},"place_id":"ChIJtXCQFoXrAzQRrukXKSWu5lA","types":["postal_code"]},{"address_components":[{"long_name":"广东省","short_name":"广东省","types":["administrative_area_level_1","political"]},{"long_name":"中国","short_name":"CN","types":["country","political"]}],"formatted_address":"中国广东省","geometry":{"bounds":{"northeast":{"lat":25.5167714,"lng":117.3185074},"southwest":{"lat":20.2209735,"lng":109.668994}},"location":{"lat":23.132191,"lng":113.266531},"location_type":"APPROXIMATE","viewport":{"northeast":{"lat":25.5167714,"lng":117.3184346},"southwest":{"lat":20.2209735,"lng":109.668994}}},"place_id":"ChIJP1yvMvGFUjERKZ8lCW8c1C4","types":["administrative_area_level_1","political"]},{"address_components":[{"long_name":"中国","short_name":"CN","types":["country","political"]}],"formatted_address":"中国","geometry":{"bounds":{"northeast":{"lat":53.56097399999999,"lng":134.7728099},"southwest":{"lat":18.1576156,"lng":73.4994136}},"location":{"lat":35.86166,"lng":104.195397},"location_type":"APPROXIMATE","viewport":{"northeast":{"lat":53.56097399999999,"lng":134.7728099},"southwest":{"lat":18.1576156,"lng":73.4994136}}},"place_id":"ChIJwULG5WSOUDERbzafNHyqHZU","types":["country","political"]}]
     * status : OK
     */

    private String status;
    /**
     * address_components : [{"long_name":"182","short_name":"182","types":["street_number"]},{"long_name":"海城路","short_name":"海城路","types":["route"]},{"long_name":"宝安区","short_name":"宝安区","types":["sublocality_level_1","sublocality","political"]},{"long_name":"深圳","short_name":"深圳","types":["locality","political"]},{"long_name":"广东省","short_name":"广东省","types":["administrative_area_level_1","political"]},{"long_name":"中国","short_name":"CN","types":["country","political"]},{"long_name":"518102","short_name":"518102","types":["postal_code"]}]
     * formatted_address : 中国广东省深圳市宝安区海城路182号 邮政编码: 518102
     * geometry : {"location":{"lat":22.567733,"lng":113.869204},"location_type":"ROOFTOP","viewport":{"northeast":{"lat":22.5690819802915,"lng":113.8705529802915},"southwest":{"lat":22.5663840197085,"lng":113.8678550197085}}}
     * place_id : ChIJyepNQwXsAzQRqm-ApqqcuqA
     * types : ["street_address"]
     */

    private List<ResultsEntity> results;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResults(List<ResultsEntity> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public List<ResultsEntity> getResults() {
        return results;
    }

    public static class ResultsEntity {
        private String formatted_address;
        /**
         * location : {"lat":22.567733,"lng":113.869204}
         * location_type : ROOFTOP
         * viewport : {"northeast":{"lat":22.5690819802915,"lng":113.8705529802915},"southwest":{"lat":22.5663840197085,"lng":113.8678550197085}}
         */

        private GeometryEntity geometry;
        private String place_id;
        /**
         * long_name : 182
         * short_name : 182
         * types : ["street_number"]
         */

        private List<AddressComponentsEntity> address_components;
        private List<String> types;

        public void setFormatted_address(String formatted_address) {
            this.formatted_address = formatted_address;
        }

        public void setGeometry(GeometryEntity geometry) {
            this.geometry = geometry;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public void setAddress_components(List<AddressComponentsEntity> address_components) {
            this.address_components = address_components;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public String getFormatted_address() {
            return formatted_address;
        }

        public GeometryEntity getGeometry() {
            return geometry;
        }

        public String getPlace_id() {
            return place_id;
        }

        public List<AddressComponentsEntity> getAddress_components() {
            return address_components;
        }

        public List<String> getTypes() {
            return types;
        }

        public static class GeometryEntity {
            /**
             * lat : 22.567733
             * lng : 113.869204
             */

            private LocationEntity location;
            private String location_type;
            /**
             * northeast : {"lat":22.5690819802915,"lng":113.8705529802915}
             * southwest : {"lat":22.5663840197085,"lng":113.8678550197085}
             */

            private ViewportEntity viewport;

            public void setLocation(LocationEntity location) {
                this.location = location;
            }

            public void setLocation_type(String location_type) {
                this.location_type = location_type;
            }

            public void setViewport(ViewportEntity viewport) {
                this.viewport = viewport;
            }

            public LocationEntity getLocation() {
                return location;
            }

            public String getLocation_type() {
                return location_type;
            }

            public ViewportEntity getViewport() {
                return viewport;
            }

            public static class LocationEntity {
                private double lat;
                private double lng;

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }

                public double getLat() {
                    return lat;
                }

                public double getLng() {
                    return lng;
                }
            }

            public static class ViewportEntity {
                /**
                 * lat : 22.5690819802915
                 * lng : 113.8705529802915
                 */

                private NortheastEntity northeast;
                /**
                 * lat : 22.5663840197085
                 * lng : 113.8678550197085
                 */

                private SouthwestEntity southwest;

                public void setNortheast(NortheastEntity northeast) {
                    this.northeast = northeast;
                }

                public void setSouthwest(SouthwestEntity southwest) {
                    this.southwest = southwest;
                }

                public NortheastEntity getNortheast() {
                    return northeast;
                }

                public SouthwestEntity getSouthwest() {
                    return southwest;
                }

                public static class NortheastEntity {
                    private double lat;
                    private double lng;

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }

                    public double getLat() {
                        return lat;
                    }

                    public double getLng() {
                        return lng;
                    }
                }

                public static class SouthwestEntity {
                    private double lat;
                    private double lng;

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }

                    public double getLat() {
                        return lat;
                    }

                    public double getLng() {
                        return lng;
                    }
                }
            }
        }

        public static class AddressComponentsEntity {
            private String long_name;
            private String short_name;
            private List<String> types;

            public void setLong_name(String long_name) {
                this.long_name = long_name;
            }

            public void setShort_name(String short_name) {
                this.short_name = short_name;
            }

            public void setTypes(List<String> types) {
                this.types = types;
            }

            public String getLong_name() {
                return long_name;
            }

            public String getShort_name() {
                return short_name;
            }

            public List<String> getTypes() {
                return types;
            }
        }
    }
}
