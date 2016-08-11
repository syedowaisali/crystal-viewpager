[ ![Download](https://api.bintray.com/packages/syedowaisali/maven/crystalviewpager/images/download.svg) ](https://bintray.com/syedowaisali/maven/crystalviewpager/_latestVersion) [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Crystal%20ViewPager-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/4116)

# Crystal ViewPager

An extended transition of android ViewPager.

![alt tag](https://drive.google.com/uc?export=view&id=0B9bDENyIABT6ZkIzWG9Ia1ZfYUE)

# Usage
Add a dependency to your `build.gradle`:
```groovy
dependencies {
    compile 'com.crystal:crystalviewpager:1.0.0'
}
```

# Sample usage

Add the CrystalPreloader to your layout:

```groovy
<com.crystalviewpager.widgets.CrystalViewPager
        android:id="@+id/viewPager"
        android:layout_width="match_parent"
        android:layout_height="200dp"
        app:ctl_vp_transition="accordion" />
```

# Transitions

Attribute | Default | Description | Options
------------ | ------------- | ------------- | -------------
ctl_vp_transition | no style | Apply different transition. | ``default_transition``, ``accordion``, ``front_to_back``, ``back_to_front``, ``cube_down``, ``cube_out``, ``depth_page``, ``flip_horizontal``, ``flip_vertical``, ``parallax_page``, ``rotate_down``, ``rotate_up``, ``stack``, ``tablet``, ``zoom_in``, ``zoom_out``, ``zoom_out_side``

# LICENSE

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

##Authors

* [Syed Owais Ali](https://github.com/syedowaisali) *original Author*
