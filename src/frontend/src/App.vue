<template>
  <v-app>
    <v-content>
      <HOME/>
    </v-content>
  </v-app>
</template>

<script>
import HOME from './components/Home';

export default {
  name: 'App',

  components: {
    HOME,
  },

  data: () => ({
    //
  }),
};
</script>
